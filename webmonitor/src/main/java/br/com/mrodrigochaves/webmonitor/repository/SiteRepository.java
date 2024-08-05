package br.com.mrodrigochaves.webmonitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mrodrigochaves.webmonitor.model.Site;

public interface SiteRepository extends JpaRepository<Site, Long> {

}
