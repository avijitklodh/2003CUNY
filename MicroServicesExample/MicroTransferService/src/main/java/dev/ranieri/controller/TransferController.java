package dev.ranieri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.ranieri.services.PointTransferService;

@Controller
public class TransferController {
	
	@Autowired
	PointTransferService pts;

	@RequestMapping(value = "/transfer/sender/{senderid}/recipient/{recipientid}/amount/{amount}")
	@ResponseBody
	public String transferPoints(@PathVariable String senderid, @PathVariable String recipientid, @PathVariable String amount ) {
		
		pts.transferPoints(Integer.parseInt(senderid), Integer.parseInt(recipientid), Integer.parseInt(amount));
		return "Transfer was successful";
	}
}
