# _Tasks management list_
API para gerenciamento de lista de tarefas (CRUD).

## Tecnologias 
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
* [SpringDoc OpenAPI 3](https://springdoc.org/)
* [Mysql](https://dev.mysql.com/downloads/) 
___
## Práticas utilizadas 
* SOLID, DRY, YAGNI, KISS
* REST API
* Consultas com Spring Data JPA
* Injeção de Dependências
* Tratamento de respostas de erro
* Geração automática do Swagger com a OpenAPI 3
___
## Como executar
* Clonar o repositório
* Construir o projeto: 
```java 
$ ./mvnw clean package
```
* Executar aplicação:
```java 
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```
A API poderá ser acessada em [localhost:8080](http://localhost:8080). O Swagger poderá ser visualizado em [localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html.
___
## API Endpoints
Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io/):
* Criar tarefa
```java
$ http POST :8080/todos name="Task 1" description="Descrip task 1" prioryti=1

[
  {
    "id": 1,
    "name": "Task 1",
    "description": "Descrip task 1",   
    "prioryti": 1,
    "done": false
  }
]
```
* Listar tarefas
```java
$ http POST :8080/todos 

[
  {
    "id": 1,
    "name": "Task 1",
    "description": "Descrip task 1",   
    "prioryti": 1,
    "done": false
  }
]
```
* Editar tarefa
```java
$ http POST :8080/todos name="Task 1 edited" description="Descrip task 1 edited" prioryti=1

[
  {
    "id": 1,
    "name": "Task 1 edited",
    "description": "Descrip task 1 edited",   
    "prioryti": 1,
    "done": false
  }
]
```
* Deletar tarefa
```java
http DELETE :8080/todos/1

[ ]
```