package com.pe.relari.util;

import lombok.Getter;

/**
 * @author Relari
 */

@Getter
public enum PositionCatalog {

    DEVELOPER("developer"),
    MANAGER("manager"),
    ARCHITECT("architect"),
    SCRUM_MASTER("scrum-master"),
    TEAM_LEAD("team-lead");
    
    private final String value;
    
    PositionCatalog(String value) {
        this.value = value;
    }
    
}
