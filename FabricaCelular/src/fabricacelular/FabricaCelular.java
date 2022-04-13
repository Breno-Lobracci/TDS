/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricacelular;

import java.util.ArrayList;

/**
 *
 * @author francisleide
 */
public class FabricaCelular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciando bateria
        Bateria bateria1 = new Bateria();
        bateria1.setModelo("ASDSGFGBF");
        bateria1.setCapacidade(12);
        bateria1.setMarca("Boa");
        bateria1.setVoltagem(200);
       // System.out.println("Modelo da bateria: "+bateria1.getModelo());
        //instanciando celular
        Celular celular1 = new Celular();
        celular1.setModelo("Iphone 11");
        celular1.setMarca("Apple");
        celular1.setPxCamera(12121);
        celular1.setTamanho(11);
        celular1.setBateria(bateria1);
        
        
        System.out.println("Modelo: "+celular1.getModelo());
        System.out.println("Modelo da Bateria: "+celular1.getBateria());
        
        
        //instanciando mais uma bateria
        Bateria bateria2 = new Bateria();
        bateria2.setCapacidade(24);
        bateria2.setMarca("Excelente");
        bateria2.setModelo("werzxd234");
        bateria2.setVoltagem(110);
        
        //instanciando mais uma bateria
        Bateria bateria3 = new Bateria();
        bateria3.setCapacidade(18);
        bateria3.setMarca("Boazinha");
        bateria3.setModelo("SDFREWE");
        bateria3.setVoltagem(110);
        
        //criar lista de baterias
        ArrayList<Bateria> baterias = new ArrayList<>();
        baterias.add(bateria1);
        baterias.add(bateria2);
        baterias.add(bateria3);
        
        for (int i = 0; i < baterias.size(); i++) {
            System.out.println("Modelo: "+baterias.get(i).getModelo());
            System.out.println("Capacidade: "+baterias.get(i).getCapacidade());
        }
        
        //instanciando um programa
        Programa programa1 = new Programa();
        programa1.setNome("ABC");
        programa1.setObjetivo("Compras");
        programa1.setEspacoOcupado(30);
        
        //instanciando mais um programa
        Programa programa2 = new Programa();
        programa2.setNome("QWERTY");
        programa2.setObjetivo("Vendas");
        programa2.setEspacoOcupado(50);
        
        //instanciando mais um programa
        Programa programa3 = new Programa();
        programa3.setNome("ASD");
        programa3.setObjetivo("Jogo");
        programa3.setEspacoOcupado(180);
        
        //criar lista de baterias
        ArrayList<Programa> programas = new ArrayList<>();
        programas.add(programa1);
        programas.add(programa2);
        programas.add(programa3);
        
        for (int i = 0; i < programas.size(); i++) {
            System.out.println("Programa: "+programas.get(i).getNome());
            System.out.println("Espaço ocupado pelo programa: "+programas.get(i).getEspacoOcupado());
        }
        System.out.println("Total do espaço ocupado: ");
        //TODO: 
        // instanciar vários programas 
        // instanciar uma lista de programas
        // adicionar os programas instanciados na lista
        // atribuir a lista para o celular
        // EXTRA: Calcular no getProgramas o total de espaço ocupado 
        
        
        
    }
    
}
