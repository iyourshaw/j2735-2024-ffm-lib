/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ContractValidity_H_
#define	_ContractValidity_H_


#include "asn_application.h"

/* Including external dependencies */
#include "OCTET_STRING.h"
#include "DateCompact.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* ContractValidity */
typedef struct ContractValidity {
	OCTET_STRING_t	 contractRestrictions;
	DateCompact_t	 contractExpiryDate;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} ContractValidity_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_ContractValidity;

#ifdef __cplusplus
}
#endif

#endif	/* _ContractValidity_H_ */
#include "asn_internal.h"
