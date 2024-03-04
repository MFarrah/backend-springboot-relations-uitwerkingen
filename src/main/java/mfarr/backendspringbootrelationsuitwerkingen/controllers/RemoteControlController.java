package mfarr.backendspringbootrelationsuitwerkingen.controllers;

import mfarr.backendspringbootrelationsuitwerkingen.dtos.RemoteControlDto;
import mfarr.backendspringbootrelationsuitwerkingen.services.RemoteControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Dit is de Controller klasse van de RemoteController entiteit en heeft vergelijkbare methodes als de TelevisionController.
@RestController
public class RemoteControllerController {
    private final RemoteControlService remoteControllerService;

    public RemoteControllerController(RemoteControlService remoteControlService) {
        this.remoteControllerService = remoteControlService;
    }


    @GetMapping("/remotecontrollers")
    public ResponseEntity<List<RemoteControllerDto>> getAllRemotecontrollers() {

        List<RemoteControllerDto> dtos = remoteControllerService.getAllRemoteControllers();

        return ResponseEntity.ok(dtos);
    }

    @GetMapping("/remotecontrollers/{id}")
    public ResponseEntity<RemoteControllerDto> getRemotecontroller(@PathVariable("id") Long id) {

        RemoteControllerDto dto = remoteControllerService.getRemoteController(id);

        return ResponseEntity.ok(dto);
    }

    @PostMapping("/remotecontrollers")
    public ResponseEntity<RemoteControllerDto> addRemoteController(@RequestBody RemoteControllerDto dto) {
        RemoteControllerDto dto1 = remoteControllerService.addRemoteController(dto);
        return ResponseEntity.created(null).body(dto1);
    }

    @DeleteMapping("/remotecontrollers/{id}")
    public ResponseEntity<Object> deleteRemoteController(@PathVariable("id") Long id) {
        remoteControllerService.deleteRemoteController(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/remotecontrollers/{id}")
    public ResponseEntity<RemoteControllerDto> updateTelevision(@PathVariable("id") Long id, @RequestBody RemoteControllerDto dto) {
        remoteControllerService.updateRemoteController(id, dto);
        return ResponseEntity.ok(dto);
    }

}