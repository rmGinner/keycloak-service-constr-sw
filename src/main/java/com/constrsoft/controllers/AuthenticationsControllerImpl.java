package com.constrsoft.controllers;

import com.constrsoft.controllers.interfaces.AuthenticationsController;
import com.constrsoft.dtos.httpsclients.keycloak.AutenticationDTO;
import com.constrsoft.dtos.httpsclients.keycloak.KeycloakAuthenticationRequestDTO;
import com.constrsoft.dtos.httpsclients.keycloak.KeycloakAuthenticationResponseDTO;
import com.constrsoft.services.interfaces.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "authentications")
public class AuthenticationsControllerImpl implements AuthenticationsController {

    @Autowired
    private AuthenticationService service;

    @Override
    public ResponseEntity<KeycloakAuthenticationResponseDTO> authenticate(AutenticationDTO autenticationDTO) {
        return ResponseEntity.ok(this.service.authenticate(
              autenticationDTO
        ));
    }
}
