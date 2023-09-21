<%-- 
    Document   : index
    Created on : 6 thg 9, 2023, 09:28:51
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
    </head>
    <body>
        <c:url value = "/" var = "action"  />
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Web đặt vé xe</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="collapsibleNavbar">
                    <ul class="navbar-nav me-auto">
                        <li class="nav-item"> 
                            <a class="nav-link" href="${action}">Trang chủ</a>
                        </li>
                        <c:forEach items="${Chuyenxe}" var= "c">
                            <c:url value = "/" var = "catAction">
                                <c:param name="cateId" value="${c.id}" />
                            </c:url>
                            
                            <li class="nav-item">
                                
                                <a class="nav-link" href="${catAction}">${c.tenCX}</a>
                            </li>
                        </c:forEach>
                    </ul>
                    
                    <form class="d-flex" action = "${action}">
                        <input class="form-control me-2" type="text" name ="kw" placeholder="Nhập từ khóa ...">
                        <button class="btn btn-primary" type="submit">Tìm</button>
                    </form>
                </div>
            </div>
        </nav>
        <section class="container">
            <div>
                <a href"#" class="btn btn-info" mt-2>Thêm sản phẩm</a>
            </div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Chuyến đi</th>
                        <th>Giá</th>  
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${Chuyenxe}" var="c">
                        <tr>
                            <td>
                                <<img src="" alt="${c.tenCX}"/>
                            </td>
                            <td>${c.tenCX}</td>
                            <td>${c.giaChuyen} VND</td>
                            <td>
                                <a href ="#" class="btn btn-success"> cập nhật</a>
                                <button class="btn btn-danger">
                                    Xóa
                                </button>
                            </td>

                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </section>


    </body>
</html>
