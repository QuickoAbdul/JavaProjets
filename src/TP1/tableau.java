package TP1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class tableau
{
    //declaration de var
    private int T[];
    private int inf;
    private int max;
    private int sup;


    //Constructeur

    public tableau(int inf, int sup, int max)
    {
        this.inf = inf;
        this.sup = sup;
        this.max = max;
        T = new int[max];
        for(int i = 0; i<max; i++) //gènere les nombres
        {
            T[i] = (int)((sup-inf+1)*Math.random()) + inf ; // tirer un nombre aléatoire dans l’intervalle
        }
    }
    public void exo2(int bound)
    {
        Random r = new Random();
        int nbr = r.nextInt(bound);
        System.out.println("Un nombre entre 0 et "+ bound +" à était générer trouver lequel ");
        while (true)
        {
       System.out.println("Entrez un nombre");
       Scanner sc = new Scanner(System.in);
       int var  = sc.nextInt();
       if (var < nbr)
       {
           System.out.println(var + " est trop petit réssayer");
       }
        else if(var > nbr)
       {
           System.out.println(var + " est trop grand réssayer");
       }
        if (var == nbr)
        {
            System.out.println("bravo vous avez trouver le chiffre était :" + nbr);
            break;
        }

        }
    }
    public void affiche()
    {
        for(int i = 0; i<max; i++)
        {
            System.out.print(T[i]+ " ");
        }
        System.out.println("");
    }

    public void tri()
    {
        Arrays.sort(T);
        System.out.print("TRI: ");
        for(int i = 0; i<max; i++) //Parcour le tableau
        {
            System.out.print(T[i]+ " ");
        }
        System.out.println("");

    }

    public int occurences(int n){
        int occurences = 0;
        for (int i = 0; i < max; i++)
        {
            if(T[i] == n)
            {
                occurences++;
            }
        }
        return occurences;
    }

   /* public void histogramme(){
        System.out.println("Histogramme :");
        for (int i = 0; i < T.length; i++) //Parcour la longueur du tableau
        {
            boolean res = true;
            for (int h = 0; h < T.length; h++)
            {
                if (T[i] == T[h] && h > i)
                {
                    res = false;
                }
            }
            if (res)
            {
                System.out.println(occurences(T[i]) + " fois " + T[i]);
            }
        }
        affiche();
    } */

    public void histogramme2()
    {
        for(int i = inf; i <= sup; i++)
        {
            System.out.println(occurences(T[i]) + " fois " + T[i]);
        }
    }

    public int getInf()
    {
        return inf;
    }

    public void setInf(int inf)
    {
        this.inf = inf;
    }

    public int getSup()
    {
        return sup;
    }

    public void setSup(int sup)
    {
        this.sup = sup;
    }

    //Fonction affiche

    //-> on test dans le main
    //et on continue
}


