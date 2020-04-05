
/// <reference types="Cypress" />
describe('Portfolio test case', function() {
    it('Portfolio tab clicks', function() {
      cy.visit("http://138.68.41.35/")
      cy.get('[href="/blog/testcases"]').click()
      cy.get('h3').contains("Generic")
      cy.get('.navbar-brand').click()
      cy.get('[href="/jobs/automation"]').click()
      cy.get('h2').contains("GUI")
    })
  })