package dev.ranieri.app;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dev.ranieri.entities.Associate;

@Component
@FeignClient("Associate-Service")
public interface RpasClient {
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/associates")
	Associate createAssociate(Associate associate);

}
