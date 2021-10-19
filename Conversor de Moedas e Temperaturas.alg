algoritmo "Conversor de Moedas e Temperaturas (Brasil x EUA)"
// Função : Converter moedas e Temperaturas (Brasil x EUA e vice-versa)
// Autor :  Gustavo F. vetter
// Data : 17/10/2021
// Seção de Declarações 
var
opcaoMenu1, opcaoMenu2, opcaoMenu3: literal
cotacaododia, converterrealparadolar, converterdolarparareal: real
valoremreais, valoremdolar: real
tempC, tempF: real
inicio



repita
      escreval ("Digite a opção desejada: ")
      escreval ("Opção 1: Converter Moeda")
      escreval ("Opção 2: Converter Temperatura")
      escreval ("Opção 3: Sair do menu")
      leia (opcaoMenu1)

      se opcaoMenu1 = "1" entao
         escreval ("Você quer fazer uma conversão de moedas.")
         escreval ("Digite a cotação de hoje do dólar em Reais:")
         leia (cotacaododia)
         escreval ("Hoje 1 dólar vale R$ ", cotacaododia)
         escreval (" ")
         escreval ("Digite a opção desejada: ")
         escreval ("Opção A: Converter Real para Dólar")
         escreval ("Opção B: Converter Dólar para Real")
         escreval ("Opção C: Sair do menu")
         leia (opcaoMenu2)
              se (opcaoMenu2) = "A" entao
                 escreval ("Você quer converter Reais para Dolares")
                 escreval ("Digite o valor em Reais")
                 leia (valoremreais)
                 converterrealparadolar <- valoremreais * cotacaododia
                 escreval ("R$", valoremreais, " equivale a US$", converterrealparadolar)
                 fimse
              se (opcaoMenu2) = "B" entao
                   escreval ("Você quer converter Dólares para Reais")
                   escreval ("Digite o valor em Dólares")
                   leia (valoremdolar)
                   converterdolarparareal <- valoremdolar * cotacaododia
                   escreval ("US$ ", valoremdolar, " equivale a R$ ", converterdolarparareal)

                   se (opcaoMenu2) = "C" entao
                      leia (opcaoMenu1)
                      fimse
                   fimse

      fimse
          se opcaoMenu1 = "2" entao
              escreval ("Digite a opção desejada: ")
              escreval ("Opção A: Converter Celsius para Farenheit")
              escreval ("Opção B: Converter Farenheit para Celsius")
              escreval ("Opção C: Sair do menu")
              leia (opcaoMenu3)
                   se opcaoMenu3 = "A" entao
                      escreval ("Você quer converter a temperatura de Celsius para Farenheit")
                      escreval ("Digite a temperatura em Celsius")
                      leia (tempC)
                      escreval ("A temp.informada foi de ", tempC, " graus Celsius")
                      tempF <- (tempC * 1.8 ) + 32
                      escreval (tempC," graus Celsius equivale a ", tempF," graus Farenheit")
                   fimse

                   se opcaoMenu3 = "B" entao
                      escreval ("Você quer converter a tempertura de Farenheit para Celsius")
                      escreval ("Digite a temperatura em Farenheit")
                      leia (tempF)
                      tempC <- (tempF - 32) / 1.8
                      escreval (tempF, " graus Farenheit equivale a ", tempC, " graus Celsius")
                   fimse
                   
                   se opcaoMenu3 = "C" entao
                      leia opcaoMenu1
                   fimse
            fimse
            

ate (opcaoMenu1) = "3"
    escreval ("Obrigado por usufriur de nossos serviços. Até a próxima vez.")

fimalgoritmo
