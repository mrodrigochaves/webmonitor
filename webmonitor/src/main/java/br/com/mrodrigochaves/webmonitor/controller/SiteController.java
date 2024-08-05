package br.com.mrodrigochaves.webmonitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.mrodrigochaves.webmonitor.model.Site;
import br.com.mrodrigochaves.webmonitor.service.SiteService;
import jakarta.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/sites")
public class SiteController {

    private final SiteService siteService;

    @Autowired
    public SiteController(SiteService siteService) {
        this.siteService = siteService;
    }

    @PostMapping
    public ResponseEntity<Site> createSite(@Valid @RequestBody Site site) {
        Site savedSite = siteService.saveSite(site);
        return new ResponseEntity<>(savedSite, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Site>> getAllSites() {
        List<Site> sites = siteService.findAllSites();
        return new ResponseEntity<>(sites, HttpStatus.OK);
    }

}
