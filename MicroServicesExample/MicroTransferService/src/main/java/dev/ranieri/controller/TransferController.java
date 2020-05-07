package dev.ranieri.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import dev.ranieri.services.PointTransferService;

@Controller
public class TransferController {
	
	private static final Logger logger = LogManager.getLogger();
	
	@Autowired
	PointTransferService pts;

	@RequestMapping(value = "/transfer/sender/{senderid}/recipient/{recipientid}/amount/{amount}")
	@ResponseBody
	@HystrixCommand(fallbackMethod = "localLog")
	public String transferPoints(@PathVariable String senderid, @PathVariable String recipientid, @PathVariable String amount ) {
		
		pts.transferPoints(Integer.parseInt(senderid), Integer.parseInt(recipientid), Integer.parseInt(amount));
		
		if(true) {
			throw new RuntimeException();
		}
		
		return "Transfer was successful";
	}
	
	public String localLog(String senderid,String recipientid, String amount) {
		logger.info(senderid+ " tranfer to "+ recipientid +"  amount:"+amount);
		System.out.println(senderid+ " tranfer to "+ recipientid +"  amount:"+amount);
		return "Assoicate service is down. Transfer was saved locally. Will be updated when Associate service resumes";
	}
}
