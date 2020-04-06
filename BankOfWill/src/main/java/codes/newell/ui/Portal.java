package codes.newell.ui;

import java.util.Optional;
import java.util.Set;

import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.ValueGraphBuilder;

import codes.newell.entities.Account;
import codes.newell.entities.User;
import codes.newell.services.AccountService;
import codes.newell.services.AccountServiceImpl;
import codes.newell.utilities.InsufficientFundsException;

public class Portal {
	public static void main(String[] args) {
		MutableValueGraph<String, String> graph = ValueGraphBuilder.undirected().build();
		// EndpointPair pair = new
		// graph.//("name1", "account1", "transaction1");
		graph.putEdgeValue("name1", "account2", "transaction2");
		graph.putEdgeValue("name2", "account2", "transaction3");
		Optional<String> edge = graph.edgeValue("name1", "account2");
		Set<String> out = graph.adjacentNodes("account2");
		System.out.println(out.toString());
		System.out.println(edge);

		Account account = new Account();
		account.setBalance(300.0);

		AccountService aci = new AccountServiceImpl();

		try {
			aci.withdrawFunds(account, -200.0);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}

		try {
			aci.withdrawFunds(account, -200.0);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}

		System.out.println(account.getBalance());

		User will = new User();
		will.setAdminStatus(false);
		will.setName("Will Newell");
		will.setPasswordHash("pass");
		will.setUsername("newellwm");
		will.setId(4);

		User stillWill = new User();
		stillWill.setId(4);
		stillWill.setUsername("newellwm");

		System.out.println(will.equals(stillWill));

	}
}
