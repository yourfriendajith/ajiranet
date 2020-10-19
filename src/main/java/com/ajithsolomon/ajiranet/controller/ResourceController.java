package com.ajithsolomon.ajiranet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajithsolomon.ajiranet.ResponseObject;
import com.ajithsolomon.ajiranet.entity.Devices;
import com.ajithsolomon.ajiranet.service.ResourceService;

@RestController
@RequestMapping("/ajiranet/process")
public class ResourceController {

	@Autowired
	ResourceService resourceService;

	@PostMapping(path = "/devices")
	public ResponseEntity<ResponseObject> createDevices(@RequestBody(required = false) Devices device) {
		if (device == null) {
			return new ResponseEntity<ResponseObject>(new ResponseObject("Invalid Command."), HttpStatus.BAD_REQUEST);
		}
		return resourceService.createDevices(device);
	}

	@PostMapping(path = "/devices/{name}/strength")
	public ResponseEntity<ResponseObject> modifyStrength(@PathVariable String name, @RequestBody Devices device) {
		return resourceService.modifyStrength(name, device);
	}

}
