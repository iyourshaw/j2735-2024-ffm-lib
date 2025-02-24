/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ReceiptIccId_H_
#define	_ReceiptIccId_H_


#include "asn_application.h"

/* Including external dependencies */
#include "OCTET_STRING.h"

#ifdef __cplusplus
extern "C" {
#endif

/* ReceiptIccId */
typedef OCTET_STRING_t	 ReceiptIccId_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_ReceiptIccId;
asn_struct_free_f ReceiptIccId_free;
asn_struct_print_f ReceiptIccId_print;
asn_constr_check_f ReceiptIccId_constraint;
ber_type_decoder_f ReceiptIccId_decode_ber;
der_type_encoder_f ReceiptIccId_encode_der;
xer_type_decoder_f ReceiptIccId_decode_xer;
xer_type_encoder_f ReceiptIccId_encode_xer;
jer_type_encoder_f ReceiptIccId_encode_jer;
oer_type_decoder_f ReceiptIccId_decode_oer;
oer_type_encoder_f ReceiptIccId_encode_oer;
per_type_decoder_f ReceiptIccId_decode_uper;
per_type_encoder_f ReceiptIccId_encode_uper;
per_type_decoder_f ReceiptIccId_decode_aper;
per_type_encoder_f ReceiptIccId_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _ReceiptIccId_H_ */
#include "asn_internal.h"
