/**
 * generated by Xtext 2.12.0-SNAPSHOT
 */
package org.xtext.example.mydsl;

import org.xtext.example.mydsl.MyDslAStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MyDslAStandaloneSetup extends MyDslAStandaloneSetupGenerated {
  public static void doSetup() {
    new MyDslAStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}