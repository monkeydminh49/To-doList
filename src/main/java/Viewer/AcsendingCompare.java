/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viewer;

import Model.Work;
import java.util.Comparator;

/**
 *
 * @author MinhDunk
 */
public class AcsendingCompare implements Comparator<Work>{

        @Override
        public int compare(Work o1, Work o2) {
            if (o1.isFinished()!= o2.isFinished()){
                return Boolean.compare(o1.isFinished(), o2.isFinished());
            }
            
            if (o1.getDate().compareTo(o2.getDate())!=0){
                return o1.getDate().compareTo(o2.getDate());
            }
            
            return o1.getTitle().compareTo(o2.getTitle());
        }
        
    }

