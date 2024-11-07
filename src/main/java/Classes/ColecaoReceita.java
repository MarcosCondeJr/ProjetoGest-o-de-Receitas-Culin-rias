package Classes;

import java.util.ArrayList;

public class ColecaoReceita
{
    private ArrayList<Receita> receitas = new ArrayList<>();

    public boolean adicionarReceita(Receita receita)
    {
        if(receita != null)
        {
            receitas.add(receita);
            return true;
        } 
        else 
        {
            return false;
        }  
    }

    public ArrayList<Receita> listarReceita()
    {
        return receitas;
    }

    public void removerReceita(String titulo)
    {
        if(titulo != null)
        {
            receitas.remove(titulo);
        }
        else 
        {
            System.out.println("Não possivel apagar");
        }
    }

    public void editarReceita(String titulo, Receita novaReceita)
    {
        
    }
}
