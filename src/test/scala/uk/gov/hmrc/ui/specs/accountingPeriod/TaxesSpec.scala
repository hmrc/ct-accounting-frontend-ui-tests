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
import uk.gov.hmrc.ui.pages.accountingPeriod.TaxesPage
import uk.gov.hmrc.ui.specs.BaseSpec
import uk.gov.hmrc.ui.tags.TaxesJourney
import uk.gov.hmrc.ui.util.Users.LoginTypes.HASDIRECT
import uk.gov.hmrc.ui.util.Users.UserTypes.Organisation

class TaxesSpec
    extends AnyFeatureSpec
    with BaseSpec
    with GivenWhenThen
    with ShouldVerb
    with BeforeAndAfterAll
    with BeforeAndAfterEach
    with Browser
    with ScreenshotOnFailure {
  Feature("Accounting Period Taxes") {

    Scenario(
      "Taxes- Accounting Period Overview",
      TaxesJourney
    ) {

      Given("the user logs in through the Authority Wizard page")
      AuthWizard.login(
        HASDIRECT,
        Organisation,
        returnId = Some("ct-accounting")
      )

      When("the user navigated to taxes accounting period overview")

      TaxesPage.navigateToPage(
        "http://localhost:11200/ct-accounting/accounting-period-overview/taxes"
      )
      TaxesPage.verifyPageTitle(TaxesPage.pageTitle)

    }
  }
}
