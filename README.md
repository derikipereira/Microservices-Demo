# Microservices Demo

![Microservices](link_para_uma_imagem_relacionada_ao_seu_projeto.png)

Uma arquitetura de microservices baseada em Spring Boot, MySQL e várias tecnologias de nuvem.

## Tabela de Conteúdos

- [Visão Geral do Projeto](#visão-geral-do-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Pré-Requisitos](#pré-requisitos)
- [Configuração do Ambiente](#configuração-do-ambiente)
- [Execução do Projeto](#execução-do-projeto)
- [Arquitetura de Microservices](#arquitetura-de-microservices)
- [Pontos de Integração](#pontos-de-integração)
- [Resiliência e Monitoramento](#resiliência-e-monitoramento)
- [Documentação da API](#documentação-da-api)
- [Dockerização](#dockerização)
- [Licença](#licença)
- [Autores](#autores)

## Visão Geral do Projeto

Este projeto é um exemplo de uma arquitetura de microservices desenvolvida em Spring Boot e várias tecnologias de nuvem. Ele demonstra como criar, implantar e gerenciar uma rede de serviços interconectados.

## Tecnologias Utilizadas

- Spring Boot
- MySQL
- Spring Cloud
- Spring Boot Actuator
- Feign
- Eureka
- LoadBalancer
- Ribbon
- Resilience4j (Hystrix)
- Swagger OpenAPI
- Docker

## Pré-Requisitos

Para executar este projeto, você deve ter instalado:

- [Java](link_para_o_site_do_java)
- [Docker](link_para_o_site_do_docker)

## Configuração do Ambiente

Siga estas etapas para configurar o ambiente:

1. Clone o repositório.
2. Configure as propriedades do aplicativo no arquivo `application.yml` ou `application.properties`.
3. Configure o banco de dados MySQL.
4. Configure outros serviços ou dependências necessárias.

## Execução do Projeto

Siga estas etapas para construir e executar o projeto:

1. Execute `mvn clean install` para construir o projeto.
2. Execute `java -jar nome_do_arquivo.jar` para iniciar o serviço.

## Arquitetura de Microservices

Este projeto segue uma arquitetura de microservices, composta por vários serviços independentes que se comunicam entre si.

- **Service A**: Descrição do serviço A.
- **Service B**: Descrição do serviço B.
- ...

## Pontos de Integração

Nossos serviços se integram usando as seguintes tecnologias:

- **Eureka**: Descoberta de serviços.
- **Feign**: Chamadas entre serviços.
- **Ribbon**: Balanceamento de carga.

## Resiliência e Monitoramento

Utilizamos o Resilience4j (Hystrix) para tolerância a falhas e o Spring Boot Actuator para monitoramento dos serviços.

## Documentação da API

Acesse a documentação da API gerada automaticamente usando o Swagger OpenAPI em [link_para_documentação](link_para_documentação).

## Dockerização
TO DO

## Licença

Este projeto está licenciado sob a [MIT License](https://opensource.org/license/mit/). Veja o arquivo LICENSE.md para mais detalhes.
### Violações mais comuns dos termos da licença
  1. **Remoção do Aviso de Copyright e da Licença:** A remoção do aviso de copyright e da declaração da Licença MIT do código-fonte ou da documentação viola os termos da licença.

  2. **Não Fornecer a Licença para Terceiros:** Você deve fornecer uma cópia da Licença MIT para qualquer pessoa que receba uma cópia do software. Isso inclui a distribuição de código-fonte ou binários. Não fornecer a licença aos usuários é uma violação.

  3. **Modificar a Licença MIT:** A modificação da Licença MIT para incluir restrições adicionais ou remover algumas de suas cláusulas também é uma violação dos termos da licença.

  4. **Uso em Software Proprietário:** Embora a Licença MIT permita o uso comercial, ela não permite a incorporação do software em projetos proprietários ou fechados que não respeitem a mesma licença. Isso significa que, se alguém usar seu código-fonte MIT em um projeto proprietário sem seguir os termos da Licença MIT, isso pode ser considerado uma violação.

## Autores
- Deriki da Costa Pereira Cruz

