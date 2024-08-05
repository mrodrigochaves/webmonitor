package br.com.mrodrigochaves.webmonitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mrodrigochaves.webmonitor.model.Site;
import br.com.mrodrigochaves.webmonitor.repository.SiteRepository;


@Service
public class SiteService {

    private final SiteRepository siteRepository;

     @Autowired
    public SiteService(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }

    public Site saveSite(Site site) {
        return siteRepository.save(site);
    }

    public List<Site> findAllSites() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllSites'");
    }
}
