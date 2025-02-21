![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
       start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? ou Frequencia >= 75% }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite numero A\]
        -->  inputA[\ Digite numero B \]
         --> verification{Numero A + numero B }
         --> A[/ Resultado/]
        A --> finish([ Fim ])
       
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
       start(( Início )) --> input[\ Digite um Numero\]
        input --> verification{ Numero < 0?}
        verification --> |Sim| A[/Negativo /]
        verification --> |Não| B[/ Positivo /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite sua Idade \]
        input --> verification{ Idade >= 16? }
        verification --> |Sim| A[/ Pode votar /]
        verification --> |Não| B[/ Não pode votar/]
        A --> finish([ Fim ])
        B --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
       start(( Início )) --> input[\ Digite numero A\]
        -->  inputA[\ Digite numero B \]
        --> verification{ numero A >= numero B?}
        verification --> |Sim| verificationA{ numero A == numero B?}
        verification --> |Não| verificationB{ numero B == numero A?}
        verificationA --> |Sim| A[/Os numeros são iguais! /]
        verificationA --> |não| B[/O numero A é maior! /]
        verificationB --> |Sim| C[/Os numeros são iguais! /]
        verificationB --> |não| D[/O numero B é maior! /]
   
        A --> finish([ Fim ])
        B --> finish
        C --> finish
        D --> finish
      
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início ))
      --> input[\ Digite numero A\]
      -->  inputA[\ Digite numero B \]
      -->  inputB[\ Digite numero C \]
      --> verification{ numero A >= numero B and numeroA >= numeroC?}

      verification --> |Sim| verificationA{ numero A == numero B and numeroA == numeroC?}
      verification --> |Não| verificationB{ numero B == numero C and numeroA == numeroC?}
      
      verificationA --> |sim| ifA[/numeros são iguais! /]
      verificationA --> |Não| ifB[/numeroA é maior! /]

      
      verificationB --> |sim| E[/ numeros são iguais! /]
      verificationB --> |Não| F{ numero B >= numero A and numeroB >= numeroC?}
      F -->  |sim| ifC[/numeros são iguais! /]
      F -->  |sim| ifC[/numeros são iguais! /]
      C --> finish([ Fim ])
      D --> finish
    
     
   ``` 
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
       start(( Início )) --> input[\ Digite numero A\]
        --> verification{n! = n1 * n2 * n3 ...}
        verification -->  A[/ numero A! /]
        A --> finish([ Fim ])
       
      
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
        start(( Início )) --> input[\ Digite numero A\]
        --> verification{numeroA % 2 = 1}
        verification --> |sim| A[/ numero A não é par! /]
        verification --> |não| B[/ numero A é par! /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite numero A\]
        --> verification{numeroA % 2 = 0}
        verification --> |sim| A[/ numero A não é primo! /]
        verification --> |não| B[/ numero A é primo! /]
        A --> finish([ Fim ])
        B --> finish
   ```