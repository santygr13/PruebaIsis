package com.isis.login.infraestructura.controlador;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.isis.login.LoginApplication;
import com.isis.login.aplicacion.comando.ComandoCliente;
import com.isis.login.testdatabuilder.aplicacion.ComandoClienteTestDataBuilder;
import com.isis.login.testdatabuilder.dominio.modelo.ClienteTestDataBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import javax.transaction.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = LoginApplication.class)
@AutoConfigureMockMvc
@Transactional
public class ControladorClienteTest {

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void crearClienteTest() throws Exception{


        ComandoCliente comandoCliente= new ComandoClienteTestDataBuilder().build();


        mockMvc.perform(post("http://localhost:4567/cliente")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comandoCliente))
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().is4xxClientError());

    }

}
