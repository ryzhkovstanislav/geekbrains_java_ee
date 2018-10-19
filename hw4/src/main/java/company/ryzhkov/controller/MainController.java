package company.ryzhkov.controller;

import com.ocpsoft.pretty.faces.annotation.URLMapping;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
@URLMapping(id = "main", pattern = "/main", viewId = "/WEB-INF/views/main.xhtml")
public class MainController {
}
