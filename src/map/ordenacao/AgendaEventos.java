package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //atributo
    private Map<LocalDate, Evento> agendaMap;

    public AgendaEventos() {
        agendaMap = new HashMap<>();
    }

    //métodos a serem implementados
    /*adicionarEvento(LocalDate data, String nome, String atracao): Adiciona um evento à agenda.*/
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaMap.put(data, new Evento(nome, atracao));
    }

    /*exibirAgenda(): Exibe a agenda de eventos em ordem crescente de data.*/
    public void exibirAgenda(){
        if(agendaMap.isEmpty())
            throw new RuntimeException("A agenda está vazia!");
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(agendaMap);
        System.out.println("[ AGENDA ]" + eventosOrdenados);
    }

    /*obterProximoEvento(): Retorna o próximo evento que ocorrerá.*/
    public Evento obterProximoEvento(){
        if(agendaMap.isEmpty())
            throw new RuntimeException("A agenda está vazia!");
        LocalDate hoje = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaMap);
        for(Map.Entry<LocalDate, Evento> evento: eventosTreeMap.entrySet()){
            if(evento.getKey().isEqual(hoje) || evento.getKey().isAfter(hoje)){
                proximaData = evento.getKey();
                proximoEvento = evento.getValue();
                System.out.println("O próximo evento acontecerá " + proximaData +"\n" + proximoEvento);
                break;
            }
        }
        return proximoEvento;
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 14), "Evento 5", "Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), "Evento 6", "Atração 6");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }

}
