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

package uk.gov.hmrc.ui.pages.payments

import uk.gov.hmrc.ui.pages.BasePage

import java.time.LocalDate

object FindPayments extends BasePage {

  override def pageUrl: String = "http://localhost:11200/ct-accounting/find-your-payment"

  override def pageTitle: String = "Find your payment - GOV.UK"

  def enterAmount(amount: String): Unit =
    input(Locators.txtAmount, amount)

  def selectDateRange(selectDateRangeStart: LocalDate, selectDateRangeEnd: LocalDate): Unit = {

    def enterValue(field: String, value: String): Unit = {
      clearById(field)
      inputId(field, value)
    }

    enterValue("startDate-day", selectDateRangeStart.getDayOfMonth.toString)
    enterValue("startDate-month", selectDateRangeStart.getMonthValue.toString)
    enterValue("startDate-year", selectDateRangeStart.getYear.toString)
    enterValue("endDate-day", selectDateRangeEnd.getDayOfMonth.toString)
    enterValue("endDate-month", selectDateRangeEnd.getMonthValue.toString)
    enterValue("endDate-year", selectDateRangeEnd.getYear.toString)
  }

  def findPaymentButton(): Unit =
    saveAndContinue()

}
