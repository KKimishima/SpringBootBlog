package com.github.kimishima.springbootdemo.controller;


import com.github.kimishima.springbootdemo.domain.Blog;
import com.github.kimishima.springbootdemo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/blogs","/"})
public class BlogsController {
  @Autowired
  BlogService blogService;

  @RequestMapping(method = RequestMethod.GET)
  public String index(Model model) {
    model.addAttribute("blogs", blogService.findAll());
    return "blogs/index";
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public String show(Model model, @PathVariable Long id) {
    model.addAttribute("blogs", setBlog(id));
    return "blogs/show";
  }

  @RequestMapping(method = RequestMethod.GET, value = "new")
  public String neW(Model model) {
    model.addAttribute("blogs", new Blog());
    model.addAttribute("method", "POST");
    model.addAttribute("action", "/blogs");
    return "blogs/new";
  }

  @RequestMapping(method = RequestMethod.POST)
  public String create(
      Model model,
      @ModelAttribute("formModel") Blog blog
  ) {
    Blog result = blogService.save(blog);
    model.addAttribute("blogs", result);
    return "blogs/show";
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{id}/edit")
  public String edit(Model model, @PathVariable Long id) {
    model.addAttribute("blogs", setBlog(id));
    model.addAttribute("method", "PUT");
    model.addAttribute("action", "/blogs/" + id);
    return "blogs/edit";
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
  public String update(Model model, @ModelAttribute Blog blog, @PathVariable Long id) {
    Blog result = blogService.save(blog);
    model.addAttribute("blogs", result);
    return "blogs/show";
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
  public String destroy(Model model, @PathVariable Long id) {
    blogService.delete(id);
    return "redirect:/blogs";
  }

  private Blog setBlog(Long id) {
    return blogService.findOne(id);
  }
}
