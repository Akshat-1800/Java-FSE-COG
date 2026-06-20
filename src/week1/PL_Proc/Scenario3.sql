CREATE OR REPLACE PROCEDURE TransferFunds(
    p_source_account      IN NUMBER,
    p_destination_account IN NUMBER,
    p_amount              IN NUMBER
)
IS

    v_balance NUMBER;

BEGIN

SELECT Balance
INTO v_balance
FROM Accounts
WHERE AccountID = p_source_account;

IF v_balance >= p_amount THEN

UPDATE Accounts
SET Balance = Balance - p_amount
WHERE AccountID = p_source_account;

UPDATE Accounts
SET Balance = Balance + p_amount
WHERE AccountID = p_destination_account;

COMMIT;

DBMS_OUTPUT.PUT_LINE(
            'Funds transferred successfully.'
        );

ELSE

        DBMS_OUTPUT.PUT_LINE(
            'Insufficient balance.'
        );

END IF;

EXCEPTION

    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE(
            'Account not found.'
        );

WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE(
            SQLERRM
        );

END;
/
/*
Execute-
EXEC TransferFunds(1001, 1002, 500);
 */