package mvc;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alunos
 */
public class PrimeiraLogica implements Logica {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Executando a logica e redirecionando...");
        return "primeira-logica.jsp";
    }
}
