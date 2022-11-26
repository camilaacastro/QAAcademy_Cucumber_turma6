#language:pt

  @register
  Funcionalidade: Como usuario do site Register
  Eu desejo realizar um cadastro
  Para Validar se foi cadastrado com sucesso

    @test001
    Cenario: validar cadastro com sucesso no site Register
      Dado que eu acesse o site Register
      Quando preencho o campo nome com valor "Camila" e sobrenome "Marques"
      E preencho o campo endereço com valor "R Joaquim Lapas Veiga"
      E preencho o email com valor "teste@teste.com.br"
      E preencho o campo telefone com valor "11980488458"
      E clico no checkbox feminino
      E clico no checkbox movies
      E seleciono skills "Java"
      E seleciono um country
      E seleciono o ano "1992", o mes "October", o dia "15"