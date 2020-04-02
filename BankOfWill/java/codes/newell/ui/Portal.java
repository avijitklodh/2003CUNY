package codes.newell.ui;

import java.util.Optional;
import java.util.Set;

import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.ValueGraphBuilder;

import codes.newell.entities.Account;
import codes.newell.entities.BankCurrency;
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
		BankCurrency balance = new BankCurrency("200.94");
		account.setBalance(balance);

		AccountService aci = new AccountServiceImpl();

		try {
			aci.withdrawFunds(account, new BankCurrency("-200"));
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}

		try {
			aci.withdrawFunds(account, new BankCurrency("-200"));
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}

		System.out.println(account.getBalance().getFomattedValue());
	}
}
