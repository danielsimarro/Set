/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domino;

import java.util.Random;

/**
 *
 * @author NitroPc
 */
public class FichaDomino {

    private int superior;
    private int inferior;

    public FichaDomino(int superior, int inferior) {

        this.superior = superior;
        this.inferior = inferior;

        if (superior < 0 || superior > 6) {
            if ((superior % 2) == 0) {
                this.superior = 6;
            } else {
                this.superior = 5;
            }
        }
        if (inferior < 0 || inferior > 6) {
            if ((inferior % 2) == 0) {
                this.inferior = 6;
            } else {
                this.inferior = 5;
            }

        }
    }

    public FichaDomino() {
    }

    public int getSuperior() {
        return superior;
    }

    public void setSuperior(int superior) {
        this.superior = superior;
        if (superior < 0 || superior > 6) {
            if ((superior % 2) == 0) {
                this.superior = 6;
            } else {
                this.superior = 5;
            }
        }
    }

    public int getInferior() {
        return inferior;
    }

    public void setInferior(int inferior) {
        this.inferior = inferior;
        if (inferior < 0 || inferior > 6) {
            if ((inferior % 2) == 0) {
                this.inferior = 6;
            } else {
                this.inferior = 5;
            }
        }
    }

    @Override
    public String toString() {
        if(this.superior == 0 && this.inferior==0){
            return "[ | ]";
        }else if(this.superior ==0){
            return "[ |" + this.inferior + "]";  
        }else if(this.inferior ==0){
            return "[" +this.superior + "| ]";
        }
        return "[" + this.superior + "|" + this.inferior + "]";
    }
    
    public byte getValorTotal(){
        
        return (byte) (superior+inferior);
    }
    
    public static FichaDomino generaFichaAleatoria(){
        Random random = new Random();
        int n = 0, m = 6;
        int sup = random.nextInt(m - n + 1) + n;
        int inf = random.nextInt(m - n + 1) + n;
        
        FichaDomino ficha = new FichaDomino(sup,inf);
        return ficha;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.superior;
        hash = 79 * hash + this.inferior;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FichaDomino other = (FichaDomino) obj;
        if (this.superior != other.superior) {
            return false;
        }
        if (this.inferior != other.inferior) {
            return false;
        }
        return true;
    }
    
    
    
}
