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
      "Taxes- Accounting Period Overview",
      AccountingPeriod
    ) {

      Given("the user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )
      // User lands on Accounting Period ending 30 sept 2025 page
      // User clicks on the taxes link
      When("the user navigated to taxes accounting period overview")
      // Reove below line when navigation is ready
      Taxes.navigateToPage(
        "http://localhost:11200/ct-accounting/accounting-period-overview/taxes"
      )
      Taxes.verifyPageTitle(Taxes.pageTitle)

    }

    Scenario(
      "Interest- Accounting Period Overview",
      AccountingPeriod
    ) {

      Given("the user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )
      // User lands on Accounting Period ending 30 sept 2025 page
      // User clicks on the interest link

      // Remove below line when navigation is ready
      // Uncomment below lines of code when bug DTR-7927 is fixed and interest page is available in the application
      /*   When("the user navigated to interest accounting period overview")
      Interest.navigateToPage(
        "http://localhost:11200/ct-accounting/accounting-period-overview/interest"
      )
      Interest.verifyPageTitle(Interest.pageTitle)*/

      //User clicks on Late Payment Interest link
      //User navigates back to interest accounting period overview page
      //User clicks on Late Repayment Interest link
      //User navigates back to interest accounting period overview page
      //User clicks on Debit Interest link
      //User navigates back to interest accounting period overview page
      //User clicks on Credit Interest link

    }

    Scenario(
      "Penalties- Accounting Period Overview",
      AccountingPeriod
    ) {

      Given("the user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )
      // User lands on Accounting Period ending 30 sept 2025 page
      // User clicks on the Penalties link

      When("the user navigated to penalties accounting period overview")
      // Reove below line when navigation is ready
      Penalties.navigateToPage(
        "http://localhost:11200/ct-accounting/accounting-period-overview/penalties"
      )
      Penalties.verifyPageTitle(Penalties.pageTitle)

    }

    Scenario(
      "Payments- Accounting Period Overview",
      AccountingPeriod
    ) {

      Given("the user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )
      // User lands on Accounting Period ending 30 sept 2025 page
      // User clicks on the Payments link

      // Uncomment below lines of code when bug DTR-7927 is fixed and payments page is available in the application
      /*

      When("the user navigated to payments accounting period overview")
      Payments.navigateToPage(
        "http://localhost:11200/ct-accounting/accounting-period-overview/payments"
      )
      Payments.verifyPageTitle(Payments.pageTitle)
       */

    }
    Scenario(
      "Repayments and Reallocations- Accounting Period Overview",
      AccountingPeriod
    ) {

      Given("the user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )
      // User lands on Accounting Period ending 30 sept 2025 page
      // User clicks on the Repayments and Reallocations link
      // User navigates to the Repayments and Reallocations page
      // Verify page title of repayments and reallocation page

    }

    Scenario(
      "Adjustments- Accounting Period Overview",
      AccountingPeriod
    ) {

      Given("the user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )
      // User lands on Accounting Period ending 30 sept 2025 page
      // User clicks on the Adjustments link
      When("the user navigated to adjustments accounting period overview")
      // Reove below line when navigation is ready
      Adjustments.navigateToPage(
        "http://localhost:11200/ct-accounting/accounting-period-overview/adjustments"
      )
      Adjustments.verifyPageTitle(Adjustments.pageTitle)

    }
  }
}
