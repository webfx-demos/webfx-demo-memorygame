// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.demo.memorygame.application {

    // Direct dependencies modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires webfx.platform.resource;

    // Exported packages
    exports com.example.memorygame;

    // Resources packages
    opens com.example.memorygame;
    opens com.example.memorygame.images;

    // Provided services
    provides javafx.application.Application with com.example.memorygame.Main;

}