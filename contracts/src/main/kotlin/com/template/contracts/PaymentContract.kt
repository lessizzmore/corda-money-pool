package com.template.contracts

import com.template.states.ResponsibilityState
import net.corda.core.contracts.*
import net.corda.core.transactions.LedgerTransaction


class PaymentContract : Contract {
    companion object {
        const val PAYMENT_CONTRACT_ID = "com.template.contracts.PaymentContract"
    }

    interface Commands : CommandData {
        class Issue : TypeOnlyCommandData(), Commands
        class Transfer : TypeOnlyCommandData(), Commands
        class Settle : TypeOnlyCommandData(), Commands
    }

    // A transaction is valid if the verify() function of the contract of all the transaction's input and output states
    // does not throw an exception.
    override fun verify(tx: LedgerTransaction) {
        val command = tx.commands.requireSingleCommand<Commands>()
        when (command.value) {
            is Commands.Issue -> requireThat {
            }
            is Commands.Transfer -> requireThat {
            }
            is Commands.Settle -> requireThat {
            }

        }
    }
}