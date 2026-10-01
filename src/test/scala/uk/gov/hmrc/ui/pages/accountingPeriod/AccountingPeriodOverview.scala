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

package uk.gov.hmrc.ui.pages.accountingPeriod

import uk.gov.hmrc.ui.pages.BasePage

object AccountingPeriodOverview extends BasePage {

  override def pageUrl: String = "http://localhost:11200/ct-accounting/accounting-period-overview"

  override def pageTitle: String = "Accounting period overview - GOV.UK"

  val TaxesLink: String = "/ct-accounting/accounting-period-overview/taxes"

  val InterestLink: String = "/ct-accounting/accounting-period-overview/interest"

  val PenaltiesLink: String = "/ct-accounting/accounting-period-overview/penalties"

  val PaymentsLink: String = "/ct-accounting/accounting-period-overview/payments"

  val RepaymentsReallocationsLink: String =
    "/ct-accounting/accounting-period-overview/repayments-and-reallocations"

  val AdjustmentsLink: String = "/ct-accounting/accounting-period-overview/adjustments"

}
