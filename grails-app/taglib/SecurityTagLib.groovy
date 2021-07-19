class SecurityTagLib {
    static namespace = "ifidsec"

    def redirectPage = { attrs ->
        def url = attrs.get('url')
        response.sendRedirect("${request.contextPath}" + url)
    }
}
