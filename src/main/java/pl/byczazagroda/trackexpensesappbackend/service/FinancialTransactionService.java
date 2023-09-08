package pl.byczazagroda.trackexpensesappbackend.service;

import pl.byczazagroda.trackexpensesappbackend.dto.FinancialTransactionCreateDTO;
import pl.byczazagroda.trackexpensesappbackend.dto.FinancialTransactionDTO;
import pl.byczazagroda.trackexpensesappbackend.dto.FinancialTransactionUpdateDTO;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

public interface FinancialTransactionService {

    FinancialTransactionDTO createFinancialTransaction(
            @Valid FinancialTransactionCreateDTO financialTransactionCreateDTO, Long userId);

    List<FinancialTransactionDTO> getFinancialTransactionsByWalletId(@Min(1) @NotNull Long walletId, Long userId);

    FinancialTransactionDTO findFinancialTransactionForUser(@Min(1) @NotNull Long financialTransactionId, Long userId);

    FinancialTransactionDTO updateFinancialTransaction(
            @Min(1) @NotNull Long financialTransactionId,
            @Valid FinancialTransactionUpdateDTO financialTransactionUpdateDTO,
            Long userId);

    void deleteTransactionById(@Min(1) @NotNull Long financialTransactionId, Long userId);

}
