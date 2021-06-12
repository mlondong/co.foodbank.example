package co.com.example.foodbank.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import co.com.foodbank.vault.dto.VaultDTO;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceException;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceIllegalArgumentException;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceNotAvailableException;
import co.com.foodbank.vault.sdk.model.VaultData;

/**
 * @author mauricio.londono@gmail.com co.com.example.foodbank.rest 8/06/2021
 */
@Controller
public class ControllerTest {



    @Autowired
    private ServiceTest serviceTest;


    public VaultData createVault(VaultDTO dto)
            throws JsonMappingException, JsonProcessingException,
            SDKVaultServiceException, SDKVaultServiceNotAvailableException,
            SDKVaultServiceIllegalArgumentException {
        return serviceTest.create(dto);
    }
}
