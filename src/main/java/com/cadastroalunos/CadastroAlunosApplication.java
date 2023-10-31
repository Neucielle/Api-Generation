package com.cadastroalunos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
@EntityScan("com.cadastroaluno.Model")
@EnableJpaRepositories("com.cadastroalunos.repository")
public class CadastroAlunosApplication {
    public static void main(String[] args) {
        SpringApplication.run(CadastroAlunosApplication.class, args);
    }
}
