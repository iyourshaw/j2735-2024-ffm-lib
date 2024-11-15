// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct CrossLinking {
 *     struct CrossLinking__audioLinks {
 *         struct {
 *             struct AudioLink **array;
 *             int count;
 *             int size;
 *             void (*free)(struct AudioLink *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *audioLinks;
 *     struct CrossLinking__visualLink {
 *         struct {
 *             struct VisualLink **array;
 *             int count;
 *             int size;
 *             void (*free)(struct VisualLink *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *visualLink;
 *     struct CrossLinking__rsmLink {
 *         struct {
 *             struct EventIdentifier **array;
 *             int count;
 *             int size;
 *             void (*free)(struct EventIdentifier *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *rsmLink;
 *     asn_struct_ctx_t _asn_ctx;
 * } CrossLinking_t
 * }
 */
public class CrossLinking_t extends CrossLinking {

    CrossLinking_t() {
        // Should not be called directly
    }
}

