package Servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Domain.Note;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get the file path to note.txt
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        //create a buffered reader to read the lines from note.txt
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        //create variables to hold the data from note.txt
        String title = br.readLine();
        String contents = br.readLine();
        //create a new note object
        Note note = new Note(title, contents);
        request.setAttribute("note", note);
        //close the buffered reader
        br.close();
        String Edit = request.getParameter("edit");
        if (Edit == null){
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
        else{
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get the file path to note.txt
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        //create a print writer to write on note.txt
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        //create variables to hold the data from editnote.jsp
        String title = request.getParameter("newtitle");
        String contents = request.getParameter("newcontents");
        //write the new title and contents into note.txt
        pw.println(title);
        pw.println(contents);
        //close the print writer
        pw.close();
        //create a new note object
        Note note = new Note(title, contents);
        request.setAttribute("note", note);
        //display the new data in viewnote.jsp
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }
}
