# Exceptions

Tratamento de exceções:
Exceção é um evento que interrompe o fluxo normal do processamento de uma classe.
O uso correto de exceções torna o programa mais robusto e confiável.
Com o tratamento de exceções, um programa pode continuar executando depois de lidar com um problema.
Importante: incorpore sua estratégia de tratamento de exceções no sistema desde o princípio do processo do projeto.
Pode ser difícil incluir um tratamento de exceções eficiente depois que um sistema foi implementado.

Error: usado pela JVM que serve para indicar se existe algum problema de recurso do programa, tornando a execução impossível de continuar.
Unchecked (Runtime): Exeptions que PODEM ser evitados se forem tratados e analisados pelo desenvolvedor. (geralmente são erros de lógica)
Checked Exception: Exceptions que DEVEM ser evitados e tratados pelo desenvolvedor para o programa funcionar. (acessar um arquivo que não existe, por exemplo)

Hierarquia:
Runtime herda de Exception, que por sua vez herda de Throwable.
Error herda de Throwable.
Throwable herda (é filha) de object.

Erros não checados pelo compilador (eventos irrecuperáveis)
Exceptions - condições excepcionais checadas pelo compilador (eventos recuperáveis)
Runtime Exceptions - exceções não checadas pelo compilador (erros de lógica)


try, catch, finally: Cada uma dessas palavras, juntas, definem blocos para o tratamento de exceções.
throws: Declara que um método pode lançar uma ou várias exceções.
throw: Lança explicitamente uma exception

===================================================================================================================================================================

Unchecked Exceptions:

Estudando a pilha de exceção (ou Stack Trace)
de baixo para cima.

Depois de identificar a exception você abre um try {} e coloca o bloco de código dentro do try.
Depois adicionamos um catch.
Depois colocamos um finally (mas ele é opcional)

visão:
try {

} catch {
	
 } finally {
}


====================================================================================================================================================================

Checked Exception:
Elas ocorrem quando o compilador já indica que o programa só vai "rodar" se as exceptions forem resolvidas.

Lidou-se com as exceptions dentro do método, onde após o tratamento apareceu 'throws' e o nome do tratamento da exceção, em seguida também no método main.

Para tratamento de exceptions: "A classe mais específica fica por cima, nos catches, e a mais genérica por último".

======================================================================================================================================================================

Exception Customizada (Personalizada):
É um tratamento de exception criada pelo programador. Como a exception é uma classe, significa então ter que criar uma nova classe.

======================================================================================================================================================================

#LINKS ÚTEIS:

[GitHub Camila Cavalcante](https://github.com/cami-la/exceptions-java)
