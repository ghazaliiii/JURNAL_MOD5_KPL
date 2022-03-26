/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal_mod5;

/**
 *
 * @author faishal
 */
public class Jurnal_mod5 {
   public static void main(String[] args) {
        SayaTubeVideo video1 = new SayaTubeVideo("Review Danur I Can See Ghost oleh Albani Faishal Ghazali");
        SayaTubeVideo video2 = new SayaTubeVideo("Review Suzzann Bernapas dalam Kubur  oleh Albani Faishal Ghazali");
        SayaTubeVideo video3 = new SayaTubeVideo("Review Pocong The Origin oleh Albani Faishal Ghazali");
        SayaTubeVideo video4 = new SayaTubeVideo("Review Sebelum Iblis Menjemput  oleh Albani Faishal Ghazali");
        SayaTubeVideo video5 = new SayaTubeVideo("Review Pulang oleh Albani Faishal Ghazali");
        SayaTubeVideo video6 = new SayaTubeVideo("Review Pengabdi Setan oleh Albani Faishal Ghazali");
        SayaTubeVideo video7 = new SayaTubeVideo("Review Kafir Bersekutu dengan Setan oleh Albani Faishal Ghazali");
        SayaTubeVideo video8 = new SayaTubeVideo("Review Malam Satu Suro oleh Albani Faishal Ghazali");
        SayaTubeVideo video9 = new SayaTubeVideo("Review Paku Kuntilanak oleh Albani Faishal Ghazali");
        SayaTubeVideo video10 = new SayaTubeVideo("Review Iblis dalam Kandungan oleh Albani Faishal Ghazali");
        video1.increasePlayCount(25000000);
        video2.increasePlayCount(25000000);
        video3.increasePlayCount(25000000);
        video4.increasePlayCount(25000000);
        video5.increasePlayCount(25000000);
        video6.increasePlayCount(25000000);
        video7.increasePlayCount(25000000);
        video8.increasePlayCount(25000000);
        video9.increasePlayCount(25000000);
        video10.increasePlayCount(25000000);


        SayaTubeUser username = new SayaTubeUser("Albani Faishal Ghazali");
        username.addVideo(video1);
        username.addVideo(video2);
        username.addVideo(video3);
        username.addVideo(video4);
        username.addVideo(video5);
        username.addVideo(video6);
        username.addVideo(video7);
        username.addVideo(video8);
        username.addVideo(video9);
        username.addVideo(video10);

        username.printAllVideoPlaycount();
        System.out.println("Total playcount : "+username.getTotalVideoPlayCount());
    }
    
}
