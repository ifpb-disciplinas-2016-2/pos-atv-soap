# *pos-atv-soap*
Atividade de POS, onde uma agência vende pacotes de viagem que incluem uma reserva em hotel e de passagem. Aplicação desenvolvida com a tecnologia *SOAP*

## *DOCKER*
Este projeto deve ser executado com o *Docker*, então antes de utilizá-lo certifique-se de ter instalado o *docker-compose* em seu SO

## Iniciando os serviços
Para iniciar o serviço *SOAP* execute o arquivo *startup.sh*

## Encerrando os serviços
Para encerrar os serviços, execute o arquivo *shutdown.sh*

## *Endpoints* da aplicação
Os arquivos *WSDL* podem ser encontrados nas seguintes *URLs*
  * Pacote - *URL*: *http://localhost:8081/pacote/PackageResources?WSDL*
  * Hotel - *URL*: *http://localhost:8081/reserva_hotel/HotelBookingResource?WSDL*
  * Passagem - *URL*: *http://localhost:8081/passagem/TicketResource?WSDL*
  * Cliente - *URL*: *http://localhost:8081/cliente/ClientResources?WSDL*

## soap-consumer

A aplicação *soap-consumer* é apenas um exemplo de *client* que oferece acesso aos métodos da aplicação *agency-soap*
