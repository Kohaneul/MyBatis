//package custom.login.interceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import custom.login.model.Login;
//@Component
//public class LoginInterCeptor extends HandlerInterceptorAdapter{
//	
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
//	
//	HttpSession session = request.getSession();
//	Login login = (Login)session.getAttribute("login");
//	if(login==null) {
//		String url = session.getServletContext().getContextPath()+"/login";
//		response.sendRedirect(url);
//		System.out.println("LoginInterceptor # preHandle() : No PASS");
//		return false;
//	}
//	System.out.println("LoginInterceptor # preHandle() : PASS");
//	return true;
//	
//	
//	}
//
//
//}
