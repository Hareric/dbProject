/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M11
 * Generated at: 2016-11-10 09:16:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class my_html extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write(" \n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Lyric~音乐工厂</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/frame.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/music.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/my.css\">\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"image/favicon.ico\" />\n");
      out.write("</head>\n");
      out.write("<body>  \n");
      out.write("<div class=\"header\">\n");
      out.write("    <div class=\"header-center center\">\n");
      out.write("        <h1>Lyric 音乐场</h1>\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("            <li><a href=\"./index\" class=\"active\">发现音乐</a></li>\n");
      out.write("            <li><a href=\"./my\">我的音乐</a></li>\n");
      out.write("            <li><a href=\"javascript:;\">热门专辑</a></li>\n");
      out.write("            <li><a href=\"javascript:;\">在线好友</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"top-tool\">\n");
      out.write("            <div class=\"top-search\">\n");
      out.write("                <i class=\"icn-search\"></i>\n");
      out.write("                <input type=\"text\" placeholder=\"单曲/歌手/专辑/歌单/用户\">\n");
      out.write("                <ul class=\"result\"></ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"top-user\">\n");
      out.write("                <a href=\"./login\" class=\"user-login\">登录</a>\n");
      out.write("                <div class=\"user-memb\">\n");
      out.write("                    <h4>用户</h4>\n");
      out.write("                    <ul class=\"slide-down\">\n");
      out.write("                        <li><a href=\"./my\">我的主页</a></li>\n");
      out.write("                        <li><a href=\"javascript:;\" class=\"logout\">退出</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"sub-list\">\n");
      out.write("        <div class=\"center\">\n");
      out.write("            <ul class=\"sub-nav\">\n");
      out.write("                <li><a class=\"active\" href=\"javascript:;\">推荐</a></li>\n");
      out.write("                <li><a href=\"javascript:;\">排行榜</a></li>\n");
      out.write("                <li><a href=\"javascript:;\">歌单</a></li>\n");
      out.write("                <li><a href=\"javascript:;\">主播电台</a></li>\n");
      out.write("                <li><a href=\"javascript:;\">歌手</a></li>\n");
      out.write("                <li><a href=\"javascript:;\">新碟上架</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"wrap\">\n");
      out.write("    <div class=\"wrap-in\">\n");
      out.write("        <div class=\"main-title column\">\n");
      out.write("            <div class=\"title-img\"></div>\n");
      out.write("            <div class=\"title-info\">\n");
      out.write("                <a href=\"./upload\"><button type=\"button\">上传音乐</button></a>\n");
      out.write("                <h3><span></span><input type=\"button\" value=\"编辑个人资料\"></h3>\n");
      out.write("                <div class=\"sml sml-area\">所在地区：广东省-汕头市</div>\n");
      out.write("                <div class=\"sml sml-age\">年龄：00后</div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"main-mlist column\">\n");
      out.write("            <h3>我的收藏</h3>\n");
      out.write("            <ul></ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"main-mform column\">\n");
      out.write("            <h3>我的歌单</h3>\n");
      out.write("            <ul></ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"main-mfriend column\">\n");
      out.write("            <h3>我的好友</h3>\n");
      out.write("            <ul></ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("    <div class=\"footer-center\">\n");
      out.write("        <a class=\"recruit\" href=\"javascript:;\">\n");
      out.write("            <p>独立音乐人招募计划</p>\n");
      out.write("            <span>加入我们 即将与超过亿万乐迷互动</span>\n");
      out.write("        </a>\n");
      out.write("        <div class=\"copy\">\n");
      out.write("            <ul class=\"copy-list\">\n");
      out.write("                <li><a href=\"javascript:;\">关于本站</a></li><li>-</li>\n");
      out.write("                <li><a href=\"javascript:;\"> 客户服务</a></li><li>-</li>\n");
      out.write("                <li><a href=\"javascript:;\"> 服务条款</a></li><li>-</li>\n");
      out.write("                <li><a href=\"javascript:;\"> 网站导航</a></li>\n");
      out.write("                <span>Lyric旗下版权所有©1997-2015 </span>\n");
      out.write("            </ul>\n");
      out.write("            <p>网络文化经营许可证：粤网文[2014]0332-034号</p>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"feedback\" href=\"javascript:;\"><i></i>意见反馈</a> \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- 播放条 -->\n");
      out.write("<div class=\"fix-bottom\">\n");
      out.write("    <div class=\"fix-lock\">\n");
      out.write("        <div class=\"lock-img\"><a href=\"javascript:;\" class=\"unlock\"></a></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"fix-play\">\n");
      out.write("        <div class=\"play-btns\" id=\"play-btns\">\n");
      out.write("            <a href=\"javascript:;\" class=\"prv\" title=\"上一首\"></a>\n");
      out.write("            <a href=\"javascript:;\" id=\"data-ps\" class=\"ply\" title=\"播放\"><!--.pas--></a>\n");
      out.write("            <a href=\"javascript:;\" class=\"nxt\" title=\"下一首\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"play-head\">\n");
      out.write("            <a href=\"#\"><img src=\"image/default_album.jpg\" alt=\"\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"play-ing\" id=\"play-ing\">\n");
      out.write("            <div class=\"ptitle\">\n");
      out.write("                <a href=\"#\" class=\"title\" title=\"曲名\"></a>\n");
      out.write("                <a href=\"#\" class=\"singer\" title=\"演绎者\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pbar\">\n");
      out.write("                <div class=\"barbg\"><!-- 总进度条 -->\n");
      out.write("                    <div class=\"rdy\"></div><!-- 已加载 -->\n");
      out.write("                    <div class=\"cur\">\n");
      out.write("                        <div class=\"cur-inner\">\n");
      out.write("                            <span class=\"btn-cur\"><i></i></span>\n");
      out.write("                        </div>'\n");
      out.write("                        <!-- <span class=\"btn-cur\" id=\"data-cur\"><i><!-- loading... --></i></span> -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <span class=\"clock\"><i>00:00</i> / <em>00:00</em></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"play-oper\" id=\"play-oper\">\n");
      out.write("            <a href=\"javascript:;\" class=\"icon-colle\" title=\"收藏\"></a>\n");
      out.write("            <a href=\"javascript:;\" class=\"icon-share\" title=\"分享\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"play-form\">\n");
      out.write("            <div class=\"form-title\">\n");
      out.write("                <h3>播放列表</h3>\n");
      out.write("                <a href=\"javascript:;\" class=\"icon-colle\"><span></span>收藏全部</a>\n");
      out.write("                <span>|</span>\n");
      out.write("                <a href=\"javascript:;\" class=\"icon-empty\"><span></span>清空</a>\n");
      out.write("                <a href=\"javascript:;\" class=\"table-close\" title=\"关闭\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-tab\" id=\"form-tab\">\n");
      out.write("                <ul class=\"mtab\" id=\"mtab\"><!-- 播放列表 --></ul>    \n");
      out.write("                <div class=\"empty\">播放列表为空哦</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"scrol\"><span class=\"icon-scl\"></span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"play-ctrl\" id=\"play-ctrl\">\n");
      out.write("            <div class=\"cbar\">  \n");
      out.write("                <div class=\"barbg\"><!-- 音量调节条 -->\n");
      out.write("                    <div class=\"cur\">\n");
      out.write("                        <span class=\"btn-cur\" id=\"ctrl-cur\"></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>        \n");
      out.write("            <a href=\"javascript:;\" class=\"icon-vol\" title=\"音量\"></a>\n");
      out.write("            <a href=\"javascript:;\" class=\"icon-loop\" id=\"data-lop\" title=\"循环\"></a>\n");
      out.write("            <div class=\"lp-tip\">单曲循环</div>\n");
      out.write("            <span class=\"music-list\">\n");
      out.write("                <a href=\"javascript:;\" class=\"icon-list\" title=\"播放列表\">0</a>\n");
      out.write("                <em>已添加到播放列表</em>\n");
      out.write("            </span>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    <audio id=\"player\" controls=\"false\">\n");
      out.write("        <source src=\"\"></source>\n");
      out.write("        <embed src=\"\" type=\"\" controls=\"false\">\n");
      out.write("    </audio>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../../../sea-modules/seajs/sea.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("    //设置configuration\n");
      out.write("    seajs.config({\n");
      out.write("        base: \"../../../sea-modules\",\n");
      out.write("        alias: {\n");
      out.write("            \"jquery\" : \"jquery/jquery.js\"\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    //引入main.js\n");
      out.write("    seajs.use('js/my/main');\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
