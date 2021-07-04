import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Result")
public class Result extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		response.setContentType("text/Html");
		PrintWriter out=response.getWriter();
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/Html");
		PrintWriter out=response.getWriter();
		int mark=0,Total_marks=100,m,n,a=0;
	    String ans1=request.getParameter("option1");
		String ans2=request.getParameter("option2");
		String ans3=request.getParameter("option3");
		String ans4=request.getParameter("option4");
		String ans5=request.getParameter("option5");
		String ans6=request.getParameter("option6");
		String ans7=request.getParameter("option7");
		String ans8=request.getParameter("option8");
		String ans9=request.getParameter("option9");
		String ans10=request.getParameter("option10");
		out.println("<html><head><title>Result</title></head><body><form><h3>Correct answer for Wrong & unattended Questions</h3>");
		if(ans1==null || !(ans1.equalsIgnoreCase("Mango"))) {
			out.println("<br/>1. What is our National fruit ? : Mango<br/>");
			if(ans1==null) {
				a++;
			}
		}
		else{
			mark+=10;
	    }
		if(ans2==null || !(ans2.equalsIgnoreCase("White"))) {
			out.println("2. what is the middle color in the Indian flag ? : White<br/>");
			if(ans2==null) {
				a++;
			}

		}
		else{
			mark+=10;
	    }
		if(ans3==null || !(ans3.equalsIgnoreCase("Tiger"))) {
			out.println("3. what is our national animal ? : Tiger<br/>");
			if(ans3==null) {
				a++;
			}
		}
		else{
			mark+=10;
	    }
		if(ans4==null || !(ans4.equalsIgnoreCase("Zanaganamanagana"))) {
			out.println("4. what is our National geetham ? : Zanaganamanagana<br/>");
			if(ans4==null) {
				a++;
			}
		}
		else{
			mark+=10;
	    }
		if(ans5==null || !(ans5.equalsIgnoreCase("Vellore"))) {
			out.println("5. what is the district of katpadi ? : Vellore<br/>");
			if(ans5==null) {
				a++;
			}
		}
		else{
			mark+=10;
	    }
		if(ans6==null || !(ans6.equalsIgnoreCase("Tamilnadu"))) {
			out.println("6. what is the state of Vellore ? : Tamilnadu<br/>");
			if(ans6==null) {
				a++;
			}
		}
		else{
			mark+=10;
	    }
		if(ans7==null || !(ans7.equalsIgnoreCase("India"))) {
			out.println("7. what is the Country of Tamilnadu ? : India<br/>");
			if(ans7==null) {
				a++;
			}
		}
		else{
			mark+=10;
	    }
		if(ans8==null || !(ans8.equalsIgnoreCase("Dindukkal"))) {
			out.println("8. Which is famous for lock ? : Dindukkal<br/>");
			if(ans8==null) {
				a++;
			}
		}
		else{
			mark+=10;
	    }
		if(ans9==null || !(ans9.equalsIgnoreCase("Madhurai"))) {
			out.println("9. Which is famous for Jasmine ? : Madhurai<br/>");
			if(ans9==null) {
				a++;
			}
		}
		else{
			mark+=10;
	    }
		if(ans10==null || !(ans10.equalsIgnoreCase("K A Sengotaiyan"))) {
			out.println("10. Who is the minister of Education department in tamilnadu ? : K A Sengotaiyan<br/>");
			if(ans10==null) {
				a++;
			}
		}
		else{
			mark+=10;
	    }
		m=mark/10;
		n=10-(m+a);
		out.println("<h1>MARK LIST</h1>");
		out.println("Total Marks : "+Total_marks);
		out.println("<br/>");
		out.println("Obtained Marks : "+mark);
		out.println("<br/>");
		out.println("No.of Questions answered correctly : "+m);
		out.println("<br/>");
		out.println("No.of Questions wrongly answered : "+n);
		out.println("<br/>");
		out.println("No.of Unattended Questions : "+a);
		out.println("<br/>");
		out.println("total time : 32 seconds");
		out.println("<br/>");
		out.println("</form></body></html>");
		
	}

}
