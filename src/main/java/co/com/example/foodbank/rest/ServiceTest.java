package co.com.example.foodbank.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import co.com.foodbank.vault.dto.VaultDTO;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceException;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceIllegalArgumentException;
import co.com.foodbank.vault.sdk.exception.SDKVaultServiceNotAvailableException;
import co.com.foodbank.vault.sdk.model.VaultData;
import co.com.foodbank.vault.sdk.service.SDKVaultService;

@Service
@Validated
@Transactional
public class ServiceTest {

    @Autowired
    @Qualifier("sdkService")
    private SDKVaultService sdkService;

    @Autowired
    @Qualifier("objectMapper")
    private ObjectMapper objectMapper;



    public VaultData create(VaultDTO dto)
            throws JsonMappingException, JsonProcessingException,
            SDKVaultServiceException, SDKVaultServiceNotAvailableException,
            SDKVaultServiceIllegalArgumentException {

        return objectMapper.readValue(sdkService.create(dto),
                new TypeReference<VaultData>() {});

    }



}
