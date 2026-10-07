/*
 * Copyright 2026 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.ui.specs.accountingPeriod

import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.verbs.ShouldVerb
import org.scalatest.{BeforeAndAfterAll, BeforeAndAfterEach, GivenWhenThen}
import uk.gov.hmrc.selenium.webdriver.{Browser, ScreenshotOnFailure}
import uk.gov.hmrc.ui.*
import uk.gov.hmrc.ui.pages.*
import uk.gov.hmrc.ui.pages.accountingPeriod.*
import uk.gov.hmrc.ui.specs.BaseSpec
import uk.gov.hmrc.ui.tags.*
import uk.gov.hmrc.ui.util.Users.LoginTypes.HASDIRECT
import uk.gov.hmrc.ui.util.Users.UserTypes.Organisation

class AccountingPeriodSpec
    extends AnyFeatureSpec
    with BaseSpec
    with GivenWhenThen
    with ShouldVerb
    with BeforeAndAfterAll
    with BeforeAndAfterEach
    with Browser
    with ScreenshotOnFailure {
  Feature("Accounting Periods Journey") {

    Scenario(
      "Taxes - Accounting Period Overview",
      AccountingPeriod
    ) {

      Given("The user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )
      // User lands on Accounting Balance Page

      When("The user navigated to accounting period overview")
      AccountingPeriodOverview.navigateToPage(AccountingPeriodOverview.pageUrl)
      AccountingPeriodOverview.verifyPageTitle(AccountingPeriodOverview.pageTitle)

      Then("The user clicks on Taxes link and navigates to taxes page")
      AccountingPeriodOverview.clickLinkByHref(AccountingPeriodOverview.TaxesLink)
      Taxes.verifyPageTitle(Taxes.pageTitle)
    }

    Scenario(
      "Interest - Accounting Period Overview",
      wip
    ) {

      Given("The user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )
      // User lands on Accounting Balance Page

      When("The user navigated to accounting period overview")
      AccountingPeriodOverview.navigateToPage(AccountingPeriodOverview.pageUrl)
      AccountingPeriodOverview.verifyPageTitle(AccountingPeriodOverview.pageTitle)

      Then("The user clicks on Interest link and navigates to Interest page")
      AccountingPeriodOverview.clickLinkByHref(AccountingPeriodOverview.InterestLink)
      Interest.verifyPageTitle(Interest.pageTitle)

      When("The user navigated to late payment interest page")
      Interest.clickLinkByHref(Interest.LatePaymentInterest)
      LatePaymentInterest.verifyPageTitle(LatePaymentInterest.pageTitle)

      When("User navigates back to interest page")
      AccountingPeriods.clickLinkByHref(AccountingPeriods.InterestBreadCrumbsLink)
      Interest.verifyPageTitle(Interest.pageTitle)

      When("The user navigated RepaymentInterest page")
      Interest.clickLinkByHref(Interest.RePaymentInterest)
      RePaymentInterest.verifyPageTitle(RePaymentInterest.pageTitle)

      When("User navigates back to interest accounting periods  page")
      AccountingPeriods.clickLinkByHref(AccountingPeriods.InterestBreadCrumbsLink)
      Interest.verifyPageTitle(Interest.pageTitle)

      When("The user navigated to debit interest page")
      Interest.clickLinkByHref(Interest.DebitInterest)
      DebitInterest.verifyPageTitle(DebitInterest.pageTitle)

      When("User navigates back to interest accounting periods page")
      AccountingPeriods.clickLinkByHref(AccountingPeriods.InterestBreadCrumbsLink)
      Interest.verifyPageTitle(Interest.pageTitle)

      Then("The user navigated to credit interest page")
      Interest.clickLinkByHref(Interest.CreditInterest)
      CreditInterest.verifyPageTitle(CreditInterest.pageTitle)
    }

    Scenario(
      "Penalties - Accounting Period Overview",
      AccountingPeriod
    ) {

      Given("The user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )
      // User lands on Accounting Balance Page
      When("The user navigated to penalties accounting period overview")
      AccountingPeriodOverview.navigateToPage(AccountingPeriodOverview.pageUrl)
      AccountingPeriodOverview.verifyPageTitle(AccountingPeriodOverview.pageTitle)

      Then("The user clicks on Penalties link and navigates to Penalties page")
      AccountingPeriodOverview.clickLinkByHref(AccountingPeriodOverview.PenaltiesLink)
      Penalties.verifyPageTitle(Penalties.pageTitle)
    }

    Scenario(
      "Payments - Accounting Period Overview",
      AccountingPeriod
    ) {

      Given("The user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )
      // User lands on Accounting Balance Page

      When("The user navigated to payments accounting period overview")
      AccountingPeriodOverview.navigateToPage(AccountingPeriodOverview.pageUrl)
      AccountingPeriodOverview.verifyPageTitle(AccountingPeriodOverview.pageTitle)

      Then("The user clicks on Payments link and navigates to Payments page")
      AccountingPeriodOverview.clickLinkByHref(AccountingPeriodOverview.PaymentsLink)
      Payments.verifyPageTitle(Payments.pageTitle)
    }

    Scenario(
      "Repayments and Reallocations - Accounting Period Overview",
      AccountingPeriod
    ) {

      Given("The user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )
      // User lands on Accounting Balance Page

      Then("User navigates to the Repayments and Reallocations page")
      AccountingPeriodOverview.navigateToPage(AccountingPeriodOverview.pageUrl)
      AccountingPeriodOverview.verifyPageTitle(AccountingPeriodOverview.pageTitle)

      Then("The user clicks on RepaymentsReallocations link and navigates to RepaymentsReallocations page")
      AccountingPeriodOverview.clickLinkByHref(AccountingPeriodOverview.RepaymentsReallocationsLink)
      RepaymentsReallocations.verifyPageTitle(RepaymentsReallocations.pageTitle)

    }

    Scenario(
      "Adjustments - Accounting Period Overview",
      AccountingPeriod
    ) {

      Given("The user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )
      // User lands on Accounting Balance Page

      When("The user navigated to adjustments accounting period overview")
      AccountingPeriodOverview.navigateToPage(AccountingPeriodOverview.pageUrl)
      AccountingPeriodOverview.verifyPageTitle(AccountingPeriodOverview.pageTitle)

      Then("The user clicks on Adjustments link and navigates to Adjustments page")
      AccountingPeriodOverview.clickLinkByHref(AccountingPeriodOverview.AdjustmentsLink)
      Adjustments.verifyPageTitle(Adjustments.pageTitle)

    }
  }
}
