## JAX-WS @WebService example
[Ir para tutorial](https://tomee.apache.org/examples-trunk/simple-webservice/)

- Tutorial interrompido.

## JAX-WS - Aula 1: Implementado o primeiro serviço baseado em SOAP.
[Tutorial](https://www.youtube.com/watch?v=aQnVFsWWyb4)

Publicação do serviço:
- Implementar interface do serviço: `CertidaoNascimento.java`
- Implementado o servico `CertidaoNascimentoImpl.java`
- Publicado na classe `App.java`

Consumindo o serviço implementado:
- Tutorial com problemas devido a utilização de plugins para a construção do consumidor não localizado para o Gradle.
- 
- 

Dependências:

```groovy
	implementation group: 'jakarta.xml.ws', name: 'jakarta.xml.ws-api', version: '4.0.1'
	implementation group: 'com.sun.xml.ws', name: 'jaxws-rt', version: '4.0.2'
	implementation group: 'com.sun.xml.ws', name: 'jaxws-ri', version: '4.0.2', ext: 'pom'
```