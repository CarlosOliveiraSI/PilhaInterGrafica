
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Recorde {
    private String nomeRecordista;
    private Date dataRecordista;
    private double tempoRecordista;
    
    public Recorde(String nomeRecordista, Date dataRecordista, double tempoRecordista){
        this.nomeRecordista = nomeRecordista;
        this.dataRecordista = dataRecordista;
        this.tempoRecordista = tempoRecordista;
    }

    public String getNomeRecordista() {
        return nomeRecordista;
    }

    public void setNomeRecordista(String nomeRecordista) {
        this.nomeRecordista = nomeRecordista;
    }

    public Date getDataRecordista() {
        return dataRecordista;
    }

    public void setDataRecordista(Date dataRecordista) {
        this.dataRecordista = dataRecordista;
    }

    public double getTempoRecordista() {
        return tempoRecordista;
    }

    public void setTempoRecordista(double tempoRecordista) {
        this.tempoRecordista = tempoRecordista;
    }
    
     @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(dataRecordista);
        return "Nome: " + nomeRecordista + ", Data: " + dataFormatada + ", Tempo: " + tempoRecordista;
    }
    
}
